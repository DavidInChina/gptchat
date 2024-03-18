package be;

import ae.AbstractC1980f;
import android.view.View;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class f extends ArrayList {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ g f25955Y;

    public f(g gVar) {
        this.f25955Y = gVar;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        View view = (View) obj;
        AbstractC3557B.c0("element", view);
        Iterator it = this.f25955Y.f25956a.iterator();
        while (it.hasNext()) {
            ((AbstractC1980f) it.next()).a(view, true);
        }
        return super.add(view);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof View) {
            return super.contains((View) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof View) {
            return super.indexOf((View) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof View) {
            return super.lastIndexOf((View) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof View) {
            return super.remove((View) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        Object remove = super.remove(i10);
        AbstractC3557B.b0("super.removeAt(index)", remove);
        View view = (View) remove;
        Iterator it = this.f25955Y.f25956a.iterator();
        while (it.hasNext()) {
            ((AbstractC1980f) it.next()).a(view, false);
        }
        return view;
    }
}
