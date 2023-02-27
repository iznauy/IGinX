from enum import IntEnum


class Status(IntEnum):
    SUCCESS = 0
    FAIL_TO_CREATE_SOCKET = -1
    FAIL_TO_BIND_ADDR = -2
    FAIL_TO_LOAD_CLASS = -3

    TYPE_BOOLEAN = 1
    TYPE_INTEGER = 2
    TYPE_LONG = 3
    TYPE_FLOAT = 4
    TYPE_DOUBLE = 5
    TYPE_BINARY = 6
