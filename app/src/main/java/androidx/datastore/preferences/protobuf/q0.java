package androidx.datastore.preferences.protobuf;

import com.google.protobuf.x1;
import java.util.ListIterator;
import lg.C4449G;

/* loaded from: classes.dex */
public final class q0 implements ListIterator {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f25104Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final ListIterator f25105Z;

    public q0(com.google.android.gms.internal.play_billing.E0 e02, int i10) {
        this.f25105Z = e02.f26841Y.listIterator(i10);
    }

    public final void a() {
        switch (this.f25104Y) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
            default:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        switch (this.f25104Y) {
            case 0:
                String str = (String) obj;
                a();
                throw null;
            case 1:
                String str2 = (String) obj;
                a();
                throw null;
            case 2:
                String str3 = (String) obj;
                throw new UnsupportedOperationException();
            case 3:
                String str4 = (String) obj;
                a();
                throw null;
            default:
                String str5 = (String) obj;
                a();
                throw null;
        }
    }

    public final String b() {
        switch (this.f25104Y) {
            case 0:
                return (String) this.f25105Z.next();
            case 1:
                return (String) this.f25105Z.next();
            case 2:
            default:
                return (String) this.f25105Z.next();
            case 3:
                return (String) this.f25105Z.next();
        }
    }

    public final String c() {
        switch (this.f25104Y) {
            case 0:
                return (String) this.f25105Z.previous();
            case 1:
                return (String) this.f25105Z.previous();
            case 2:
            default:
                return (String) this.f25105Z.previous();
            case 3:
                return (String) this.f25105Z.previous();
        }
    }

    public final void d() {
        switch (this.f25104Y) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
            default:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f25104Y) {
            case 0:
                return this.f25105Z.hasNext();
            case 1:
                return this.f25105Z.hasNext();
            case 2:
                return this.f25105Z.hasNext();
            case 3:
                return this.f25105Z.hasNext();
            default:
                return this.f25105Z.hasNext();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f25104Y) {
            case 0:
                return this.f25105Z.hasPrevious();
            case 1:
                return this.f25105Z.hasPrevious();
            case 2:
                return this.f25105Z.hasPrevious();
            case 3:
                return this.f25105Z.hasPrevious();
            default:
                return this.f25105Z.hasPrevious();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        switch (this.f25104Y) {
            case 0:
                return b();
            case 1:
                return b();
            case 2:
                return (String) this.f25105Z.next();
            case 3:
                return b();
            default:
                return b();
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f25104Y) {
            case 0:
                return this.f25105Z.nextIndex();
            case 1:
                return this.f25105Z.nextIndex();
            case 2:
                return this.f25105Z.nextIndex();
            case 3:
                return this.f25105Z.nextIndex();
            default:
                return this.f25105Z.nextIndex();
        }
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        switch (this.f25104Y) {
            case 0:
                return c();
            case 1:
                return c();
            case 2:
                return (String) this.f25105Z.previous();
            case 3:
                return c();
            default:
                return c();
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f25104Y) {
            case 0:
                return this.f25105Z.previousIndex();
            case 1:
                return this.f25105Z.previousIndex();
            case 2:
                return this.f25105Z.previousIndex();
            case 3:
                return this.f25105Z.previousIndex();
            default:
                return this.f25105Z.previousIndex();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f25104Y) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        switch (this.f25104Y) {
            case 0:
                String str = (String) obj;
                d();
                throw null;
            case 1:
                String str2 = (String) obj;
                d();
                throw null;
            case 2:
                String str3 = (String) obj;
                throw new UnsupportedOperationException();
            case 3:
                String str4 = (String) obj;
                d();
                throw null;
            default:
                String str5 = (String) obj;
                d();
                throw null;
        }
    }

    public q0(C4449G c4449g, int i10) {
        this.f25105Z = c4449g.f38348Y.listIterator(i10);
    }

    public q0(s0 s0Var, int i10) {
        this.f25105Z = s0Var.f25112Y.listIterator(i10);
    }

    public q0(androidx.glance.appwidget.protobuf.h0 h0Var, int i10) {
        this.f25105Z = h0Var.f25222Y.listIterator(i10);
    }

    public q0(x1 x1Var, int i10) {
        this.f25105Z = x1Var.f27641Y.listIterator(i10);
    }
}
