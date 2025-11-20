#include <iostream>
#include <vector>
#include <string>
class HYCStack {
private:
    static std::vector<std::string> ITEM_ARRAY;

public:
    // push item into stack
    static void pushItem(const std::string& item) {
        ITEM_ARRAY.push_back(item);
    }

    // Show items in the stack
    static void showStack() {
        std::cout << "[";
        for (size_t i = 0; i < ITEM_ARRAY.size(); i++) {
            std::cout << ITEM_ARRAY[i];
            if (i != ITEM_ARRAY.size() - 1) std::cout << ", ";
        }
        std::cout << "]\n";
    }

    // Return size of the stack
    static void getSize() {
        std::cout << ITEM_ARRAY.size() << "\n";
    }

    // Check if empty
    static bool isEmpty() {
        if (ITEM_ARRAY.empty()) {
            std::cout << "True";
            return true;
        } else {
            std::cout << "False";
            return false;
        }
    }

    // Get last item (top)
    static std::string getLast() {
        if (!ITEM_ARRAY.empty()) {
            std::cout << ITEM_ARRAY.back();
            return ITEM_ARRAY.back();
        }
        return "";
    }

    // Pop item
    static std::string popItem() {
        if (!ITEM_ARRAY.empty()) {
            std::string last = ITEM_ARRAY.back();
            std::cout << last;
            ITEM_ARRAY.pop_back();
            if (!ITEM_ARRAY.empty()) {
                return ITEM_ARRAY.back();
            }
            return "";
        }
        return "";
    }

    // Peek top item (no remove)
    static void peekItem() {
        if (!ITEM_ARRAY.empty()) {
            std::cout << ITEM_ARRAY.back();
        }
    }

    // Empty the stack
    static void makeEmpty() {
        ITEM_ARRAY.clear();
    }
};
