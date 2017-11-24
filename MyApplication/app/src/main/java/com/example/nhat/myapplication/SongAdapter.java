package com.example.nhat.myapplication;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;


/**
 * Created by Nhat on 24-11-02017.
 */

public class SongAdapter extends ArrayAdapter<Song> {
    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private List<Song> mSongs;

    public SongAdapter(Context context, List<Song> objects) {
        super(context, 0, objects);
        mContext = context;
        mSongs = objects;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //get song object at position
        Song song = mSongs.get(position);
        //inflat view from row_song.xml
        convertView = mLayoutInflater.inflate(R.layout.row_song, parent, false);

        //findViewBId in convertView
        TextView tvCode = (TextView) convertView.findViewById(R.id.tv_code);
        TextView tvTitle = (TextView) convertView.findViewById(R.id.tv_title);
        TextView tvLyric = (TextView) convertView.findViewById(R.id.tv_lyric);
        TextView tvArtist = (TextView) convertView.findViewById(R.id.tv_artist);

        //set attribute
        tvCode.setText(song.getCode());
        tvTitle.setText(song.getTitle());
        tvLyric.setText(song.getLyric());
        tvArtist.setText(song.getArtist());

        return convertView;
    }
}
