package aplanas.socialapp;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

public class homeLikesFragment extends homeFragment{

    @Override
    Query getQuery() {

        return FirebaseFirestore.getInstance().collection("posts").limit(50).orderBy("likes", Query.Direction.DESCENDING);
    }
}
