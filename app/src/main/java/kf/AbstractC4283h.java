package kf;

import java.util.AbstractList;
import java.util.List;
import xf.AbstractC6440c;

/* renamed from: kf.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4283h extends AbstractList implements List, AbstractC6440c {
    public abstract int r();

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i10) {
        return s(i10);
    }

    public abstract Object s(int i10);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return r();
    }
}
