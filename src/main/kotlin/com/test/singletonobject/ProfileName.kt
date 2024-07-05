import com.test.singletonobject.ProfileUtility

object ProfileName: ProfileUtility() {
    var name:String = "Tim";

    init {
        println("ProfileName init test");
    }

     fun showAddName( name:String):String{
         this.name = changeStringToUpperCase(this.name);

         return "${this.name} ${name}"
     }
 }