package id.co.aminfaruq.footballmania;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecycleActivity extends AppCompatActivity {

    // TODO 1 mengenerate butterknife untuk recyclerview

    @BindView(R.id.my_recyler_view)
    RecyclerView myRecylerView;

    String[] namaClub, detailClub;
    int[] gambarClub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        ButterKnife.bind(this);

        //TODO 3 mengisi variable array
        namaClub = getResources().getStringArray(R.array.club_name);
        detailClub = getResources().getStringArray(R.array.club_detail);
        gambarClub = new int[]{R.drawable.img_barca, R.drawable.img_madrid, R.drawable.img_bayern, R.drawable.img_city,
        R.drawable.img_mu, R.drawable.img_chelsea, R.drawable.img_acm, R.drawable.img_arsenal};

        //TODO 4 membuat object dan mengirim data nama, detail , dan gambar ke adapter
        Adapter adapter = new Adapter(RecycleActivity.this, gambarClub,namaClub, detailClub);
        //TODO 5 mensetting recyclerview dan mereset recycleview dengan adapter
        myRecylerView.setHasFixedSize(true);
        myRecylerView.setLayoutManager(new LinearLayoutManager(RecycleActivity.this));
        myRecylerView.setAdapter(adapter);
    }
}
