break;
        }

    }catch(Exception e){
        System.out.println("enter a valid integer");
    }

    }
    int add(int i, int j){
        return i+j;
    }
    int sub(int i,int j){
        return i-j;
    }
    int multi(int i, int j){
        return i*j;
    }
    int divi(int i, int j){
        try {
            int res=i/j;
        } catch (Exception e) {
            System.out.println("arithemetic exception division by zero handled. enetr a valid argument");
        }
        return i/j;
    }
    }
