from pyomo.environ import *

# Create a concrete Pyomo model
model = ConcreteModel()

# Sets
modes = ['Truck', 'Train', 'Ship']
routes = ['Route1', 'Route2', 'Route3']

# Parameters
model.upper_bound = Param(modes, within=NonNegativeReals, initialize={'Truck': 0.5, 'Train': 0.3, 'Ship': 0.2})
model.lower_bound = Param(routes, within=NonNegativeReals, initialize={'Route1': 0.2, 'Route2': 0.4, 'Route3': 0.4})

# Decision Variables
model.x = Var(modes, within=NonNegativeReals, bounds=(0, 1))
model.y = Var(modes, routes, within=NonNegativeReals, bounds=(0, 1))

# Combined Objective (Sum of Upper and Lower Objectives)
model.obj = Objective(expr=sum(model.x[mode] for mode in modes) + sum(model.y[mode, route] for mode in modes for route in routes), sense=minimize)

# Upper-Level Constraint
model.upper_constraint = Constraint(expr=sum(model.x[mode] for mode in modes) == 1)

# Lower-Level Constraints
model.lower_constraints = ConstraintList()
for mode in modes:
    model.lower_constraints.add(expr=sum(model.y[mode, route] for route in routes) == model.x[mode])

# Solver
solver = SolverFactory('glpk')

# Solve
solver.solve(model, tee=True)

# Display Solution
print("\nFinal Solution:")
for mode in modes:
    print(f"{mode}: {value(model.x[mode])}")

for mode in modes:
    for route in routes:
        print(f"{mode}, {route}: {value(model.y[mode, route])}")
