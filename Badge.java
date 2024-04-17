class Badge {
    public String print(Integer id, String name, String department) {
        if (id == null && department != null) {
            return name + " - " + department.toUpperCase();
        } else if (id != null && department == null) {
            return "[" + id + "]" + " - " + name + " - OWNER";
        } else if (id == null && department == null) {
            return name + " - OWNER";    
        }
        
        return "[" + id + "]" + " - " + name + " - " + department.toUpperCase();            
    }
}

// learning about nullability in Java. This exercise involved a lot of conditionality, as well as understanding 
// how classes work vs data primitives.