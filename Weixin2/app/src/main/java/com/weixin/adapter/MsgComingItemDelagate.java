package com.weixin.adapter;


import android.text.TextUtils;
import android.view.View;

import com.weixin.MyApplication;
import com.weixin.R;
import com.weixin.adapter.base.ItemViewDelegate;
import com.weixin.bean.ImBean;
import com.weixin.bean.MessageBean;
import com.weixin.tcp.Media;



/**
 * Created by zhy on 16/6/22.
 */
public class MsgComingItemDelagate implements ItemViewDelegate<ImBean>
{
    @Override
    public int getItemViewLayoutId()
    {
        return R.layout.main_chat_from_msg;
    }

    @Override
    public boolean isForViewType(ImBean item, int position)
    {
          String sendId = new String(item.getSendId());
        //此处判断返回的布局
        if(item.getType() == 0){
            if(!sendId.equals(MyApplication.myId)){
                return true;
            }
        }
        else if(item.getType() == 1){
            if(!sendId.equals(MyApplication.myId)){
                return true;
            }
        }

        return false;
    }

    @Override
    public void convert(ViewHolder holder, final ImBean chatMessage, int position)
    {
        if (chatMessage.getType() == 1) {
            holder.setText(R.id.chat_from_content, new String("语音"));
             holder.setOnClickListener(R.id.chat_from_content, new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Media m = new Media();
                    if(!TextUtils.isEmpty(chatMessage.getPath())){
                        m.startPlay(chatMessage.getPath());
                    }
                }
            });
        }
        else {
            holder.setText(R.id.chat_from_content, new String(chatMessage.getContent()));
        }

    }
}