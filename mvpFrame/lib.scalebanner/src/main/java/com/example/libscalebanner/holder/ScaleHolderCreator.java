package com.example.libscalebanner.holder;



public interface ScaleHolderCreator<VH extends ScaleViewHolder> {
    /**
     * 创建ViewHolder
     * @return
     */
    public VH createViewHolder();
}
