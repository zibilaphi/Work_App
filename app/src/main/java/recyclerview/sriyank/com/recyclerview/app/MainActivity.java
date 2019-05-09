package recyclerview.sriyank.com.recyclerview.app;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import recyclerview.sriyank.com.recyclerview.R;
import recyclerview.sriyank.com.recyclerview.adapter.RecyclerAdapter;
import recyclerview.sriyank.com.recyclerview.model.Landscape;

/**
 * Author : Sriyank Siddhartha
 * Module 6: Navigation Drawer
 *
 * 		"AFTER" demo project: Full Height Navigation Drawer Demo
 */
public class MainActivity extends AppCompatActivity {

	private Toolbar toolbar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		setUpToolbar();

		setUpDrawer();


	}

	private void setUpToolbar() {

		toolbar = (Toolbar) findViewById(R.id.toolbar);
		//toolbar.setTitle("Home");
		toolbar.inflateMenu(R.menu.menu_main);
	}

	private void setUpDrawer() {

		NavigationDrawerFragment drawerFragment = (NavigationDrawerFragment) getSupportFragmentManager().findFragmentById(R.id.nav_drwr_fragment);
		DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
		drawerFragment.setUpDrawer(R.id.nav_drwr_fragment, drawerLayout, toolbar);
	}


}
