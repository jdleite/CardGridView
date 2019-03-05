package meusconvidados.com.br.cardgridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.EventLogTags;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Book> lstBook;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lstBook = new ArrayList<>();
        lstBook.add(new Book("Jefferson","Category Book", "Description",R.drawable.themartian));
        lstBook.add(new Book("Bruno","Category Book", "Description",R.drawable.hediedwith));
        lstBook.add(new Book("Katia","Category Book", "Description",R.drawable.sfds));
        lstBook.add(new Book("Criz","Category Book", "Description",R.drawable.dd));
        lstBook.add(new Book("Book","Category Book", "Description",R.drawable.ff));
        lstBook.add(new Book("Book","Category Book", "Description",R.drawable.mariasemples));
        lstBook.add(new Book("Book","Category Book", "Description",R.drawable.thevigitarian));
        lstBook.add(new Book("Book","Category Book", "Description",R.drawable.privacy));
        lstBook.add(new Book("Book","Category Book", "Description",R.drawable.themartian));
        lstBook.add(new Book("Book","Category Book", "Description",R.drawable.themartian));
        lstBook.add(new Book("Book","Category Book", "Description",R.drawable.themartian));
        lstBook.add(new Book("Book","Category Book", "Description",R.drawable.themartian));
        lstBook.add(new Book("Book","Category Book", "Description",R.drawable.themartian));
        lstBook.add(new Book("Book","Category Book", "Description",R.drawable.themartian));
        lstBook.add(new Book("Book","Category Book", "Description",R.drawable.themartian));
        lstBook.add(new Book("Book","Category Book", "Description",R.drawable.themartian));
        lstBook.add(new Book("Book","Category Book", "Description",R.drawable.themartian));
        lstBook.add(new Book("Book","Category Book", "Description",R.drawable.themartian));
        lstBook.add(new Book("Book","Category Book", "Description",R.drawable.themartian));
        lstBook.add(new Book("Book","Category Book", "Description",R.drawable.themartian));
        lstBook.add(new Book("Book","Category Book", "Description",R.drawable.themartian));
        lstBook.add(new Book("Book","Category Book", "Description",R.drawable.themartian));

        RecyclerView myrv = findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);

    }
}
