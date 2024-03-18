package kf;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: kf.F  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4270F extends AbstractC4280e {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f37441Y = 1;

    /* renamed from: Z  reason: collision with root package name */
    public final Object f37442Z;

    public C4270F(Lg.g gVar) {
        this.f37442Z = gVar;
    }

    @Override // kf.AbstractC4276a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        switch (this.f37441Y) {
            case 1:
                if (!(obj instanceof String)) {
                    return false;
                }
                return super.contains((String) obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i10) {
        int i11 = this.f37441Y;
        Object obj = this.f37442Z;
        switch (i11) {
            case 0:
                return ((List) obj).get(s.L1(i10, this));
            default:
                String group = ((Lg.g) obj).f11148a.group(i10);
                if (group == null) {
                    return "";
                }
                return group;
        }
    }

    @Override // kf.AbstractC4280e, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        switch (this.f37441Y) {
            case 1:
                if (!(obj instanceof String)) {
                    return -1;
                }
                return super.indexOf((String) obj);
            default:
                return super.indexOf(obj);
        }
    }

    @Override // kf.AbstractC4280e, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        switch (this.f37441Y) {
            case 0:
                return listIterator(0);
            default:
                return super.iterator();
        }
    }

    @Override // kf.AbstractC4280e, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f37441Y) {
            case 1:
                if (!(obj instanceof String)) {
                    return -1;
                }
                return super.lastIndexOf((String) obj);
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // kf.AbstractC4280e, java.util.List
    public final ListIterator listIterator() {
        switch (this.f37441Y) {
            case 0:
                return listIterator(0);
            default:
                return super.listIterator();
        }
    }

    @Override // kf.AbstractC4276a
    public final int r() {
        int i10 = this.f37441Y;
        Object obj = this.f37442Z;
        switch (i10) {
            case 0:
                return ((List) obj).size();
            default:
                return ((Lg.g) obj).f11148a.groupCount() + 1;
        }
    }

    @Override // kf.AbstractC4280e, java.util.List
    public final ListIterator listIterator(int i10) {
        switch (this.f37441Y) {
            case 0:
                return new j0.J(this, i10);
            default:
                return new C4278c(this, i10);
        }
    }

    public C4270F(List list) {
        this.f37442Z = list;
    }
}
