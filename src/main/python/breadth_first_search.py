"""
Breadth-first search is used to calculate the shortest path for an unweighted graph.
"""

from collections import deque


def person_is_seller(name):
    return name[-1] == 'm'


def search(name):

    search_queue = deque()
    search_queue += graph[name]
    searched = []

    while search_queue:
        person = search_queue.popleft()
        if person_is_seller(person):
            print(person + " is a seller!")
            return True
        else:
            search_queue += graph[person]
            searched.append(person)
    return False


graph = {}
graph["you"] = ["alice", "bob", "claire"]
graph["bob"] = ["anuj", "peggy"]
graph["alice"] = ["peggy"]
graph["claire"] = ["thom", "jonny"]
graph["anuj"] = []
graph["peggy"] = []
graph["tom"] = []
graph["jonny"] = []

search("you")
