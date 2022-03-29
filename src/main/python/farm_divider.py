def get_quarter(x, y):
    print("{} - {}".format(x, y))

    if y < x and y != 0:
        return get_quarter(x % y, y)
    elif y > x != 0:
        return get_quarter(y % x, x)
    else:
        if x == 0:
            x = y
        elif y == 0:
            y = x

        return x, y


'''
Divide this farm evenly into square plots. 
You want the plots to be as big as possible.
'''
xT = 1680
yT = 640

print(get_quarter(xT, yT))
