import numpy as np

area_of_paralelogram_uv = lambda u, v: np.linalg.norm(np.cross(u, v))
area_of_paralelogram_uw = lambda u, w: np.linalg.norm(np.cross(u, w))
area_of_paralelogram_vw = lambda v, w: np.linalg.norm(np.cross(v,w))


volume_of_parallelopiped = lambda u, v, w: abs(np.dot(u, np.cross(v, w)))


u = np.array([1, 2, 3])
v = np.array([4, 5, 6])
w = np.array([7, 8, 9])


area = area_of_paralelogram_uv(u, v) + area_of_paralelogram_uw(u,w) + area_of_paralelogram_vw(v,w)
volume = volume_of_parallelopiped(u, v, w)

print(f"Parallelogram Area: {area:.2f}")
print("Parallelepiped Volume:", volume)
