package androidx.datastore.preferences.protobuf;

import com.google.protobuf.C2510h1;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import lg.C4444B;

/* loaded from: classes.dex */
public final class m0 implements Iterator {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f25085Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f25086Z;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f25087h0;

    /* renamed from: i0  reason: collision with root package name */
    public Iterator f25088i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractMap f25089j0;

    public /* synthetic */ m0(AbstractMap abstractMap, int i10) {
        this.f25085Y = i10;
        this.f25089j0 = abstractMap;
        this.f25086Z = -1;
    }

    public final Iterator a() {
        int i10 = this.f25085Y;
        AbstractMap abstractMap = this.f25089j0;
        switch (i10) {
            case 0:
                if (this.f25088i0 == null) {
                    this.f25088i0 = ((i0) abstractMap).f25062h0.entrySet().iterator();
                }
                return this.f25088i0;
            case 1:
                if (this.f25088i0 != null) {
                    return this.f25088i0;
                }
                ((androidx.glance.appwidget.protobuf.d0) abstractMap).getClass();
                throw null;
            case 2:
                if (this.f25088i0 == null) {
                    this.f25088i0 = ((C2510h1) abstractMap).f27556h0.entrySet().iterator();
                }
                return this.f25088i0;
            default:
                if (this.f25088i0 == null) {
                    this.f25088i0 = ((C4444B) abstractMap).f38340h0.entrySet().iterator();
                }
                return this.f25088i0;
        }
    }

    public final Map.Entry b() {
        int i10 = this.f25085Y;
        AbstractMap abstractMap = this.f25089j0;
        switch (i10) {
            case 0:
                this.f25087h0 = true;
                int i11 = this.f25086Z + 1;
                this.f25086Z = i11;
                i0 i0Var = (i0) abstractMap;
                if (i11 < i0Var.f25061Z.size()) {
                    return (Map.Entry) i0Var.f25061Z.get(this.f25086Z);
                }
                return (Map.Entry) a().next();
            case 1:
                this.f25087h0 = true;
                this.f25086Z++;
                ((androidx.glance.appwidget.protobuf.d0) abstractMap).getClass();
                throw null;
            case 2:
                this.f25087h0 = true;
                int i12 = this.f25086Z + 1;
                this.f25086Z = i12;
                C2510h1 c2510h1 = (C2510h1) abstractMap;
                if (i12 < c2510h1.f27555Z.size()) {
                    return (Map.Entry) c2510h1.f27555Z.get(this.f25086Z);
                }
                return (Map.Entry) a().next();
            default:
                this.f25087h0 = true;
                int i13 = this.f25086Z + 1;
                this.f25086Z = i13;
                C4444B c4444b = (C4444B) abstractMap;
                if (i13 < c4444b.f38339Z.size()) {
                    return (Map.Entry) c4444b.f38339Z.get(this.f25086Z);
                }
                return (Map.Entry) a().next();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f25085Y;
        AbstractMap abstractMap = this.f25089j0;
        switch (i10) {
            case 0:
                i0 i0Var = (i0) abstractMap;
                if (this.f25086Z + 1 >= i0Var.f25061Z.size() && (i0Var.f25062h0.isEmpty() || !a().hasNext())) {
                    return false;
                }
                return true;
            case 1:
                ((androidx.glance.appwidget.protobuf.d0) abstractMap).getClass();
                throw null;
            case 2:
                C2510h1 c2510h1 = (C2510h1) abstractMap;
                if (this.f25086Z + 1 >= c2510h1.f27555Z.size() && (c2510h1.f27556h0.isEmpty() || !a().hasNext())) {
                    return false;
                }
                return true;
            default:
                if (this.f25086Z + 1 >= ((C4444B) abstractMap).f38339Z.size() && !a().hasNext()) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        switch (this.f25085Y) {
            case 0:
                return b();
            case 1:
                return b();
            case 2:
                return b();
            default:
                return b();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i10 = this.f25085Y;
        AbstractMap abstractMap = this.f25089j0;
        switch (i10) {
            case 0:
                if (this.f25087h0) {
                    this.f25087h0 = false;
                    i0 i0Var = (i0) abstractMap;
                    int i11 = i0.f25059l0;
                    i0Var.b();
                    if (this.f25086Z < i0Var.f25061Z.size()) {
                        int i12 = this.f25086Z;
                        this.f25086Z = i12 - 1;
                        i0Var.o(i12);
                        return;
                    }
                    a().remove();
                    return;
                }
                throw new IllegalStateException("remove() was called before next()");
            case 1:
                if (this.f25087h0) {
                    this.f25087h0 = false;
                    androidx.glance.appwidget.protobuf.d0 d0Var = (androidx.glance.appwidget.protobuf.d0) abstractMap;
                    int i13 = androidx.glance.appwidget.protobuf.d0.f25209Y;
                    d0Var.a();
                    d0Var.getClass();
                    throw null;
                }
                throw new IllegalStateException("remove() was called before next()");
            case 2:
                if (this.f25087h0) {
                    this.f25087h0 = false;
                    C2510h1 c2510h1 = (C2510h1) abstractMap;
                    int i14 = C2510h1.f27553l0;
                    c2510h1.b();
                    if (this.f25086Z < c2510h1.f27555Z.size()) {
                        int i15 = this.f25086Z;
                        this.f25086Z = i15 - 1;
                        c2510h1.o(i15);
                        return;
                    }
                    a().remove();
                    return;
                }
                throw new IllegalStateException("remove() was called before next()");
            default:
                if (this.f25087h0) {
                    this.f25087h0 = false;
                    C4444B c4444b = (C4444B) abstractMap;
                    int i16 = C4444B.f38337k0;
                    c4444b.b();
                    if (this.f25086Z < c4444b.f38339Z.size()) {
                        int i17 = this.f25086Z;
                        this.f25086Z = i17 - 1;
                        c4444b.l(i17);
                        return;
                    }
                    a().remove();
                    return;
                }
                throw new IllegalStateException("remove() was called before next()");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(C4444B c4444b) {
        this(c4444b, 3);
        this.f25085Y = 3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(androidx.glance.appwidget.protobuf.d0 d0Var) {
        this(d0Var, 1);
        this.f25085Y = 1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(C2510h1 c2510h1) {
        this(c2510h1, 2);
        this.f25085Y = 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(i0 i0Var) {
        this(i0Var, 0);
        this.f25085Y = 0;
    }
}
