package Eg;

import Bg.d0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a extends ArrayList implements h {
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof d0)) {
            return false;
        }
        return super.contains((d0) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof d0)) {
            return -1;
        }
        return super.indexOf((d0) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof d0)) {
            return -1;
        }
        return super.lastIndexOf((d0) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof d0)) {
            return false;
        }
        return super.remove((d0) obj);
    }
}
