import random
class RandomJavaCode(object):
    def __init__(self):
        self.code = "".join([chr(random.randint(97, 122)) for _ in range(8)])
    
    def get_java_code(self):
        return self.code