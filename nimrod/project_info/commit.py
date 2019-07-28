class Commit:

    def __init__(self, base_hash, left_hash, right_hash, merge_hash, sut_class):
        self.merge_hash = merge_hash
        self.left_hash = left_hash
        self.right_hash = right_hash
        self.base_hash = base_hash
        self.sut_class = sut_class
        #self.valid_scenario = self.check_validate_scenario(base_hash, left_hash, right_hash)

    def get_merge_hash(self):
        return self.merge_hash

    def get_left_hash(self):
        return self.left_hash

    def get_right_hash(self):
        return self.right_hash

    def get_base_hash(self):
        return self.base_hash

    def get_sut_class(self):
        return self.sut_class

    def check_validate_scenario(self, base, left, right):
        if (base[:7] == left or base[:7] == right):
            return False
        else:
            return True