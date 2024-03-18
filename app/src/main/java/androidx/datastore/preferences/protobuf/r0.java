package androidx.datastore.preferences.protobuf;

import com.google.protobuf.x1;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import lg.AbstractC4460e;
import lg.C4443A;
import lg.C4449G;

/* loaded from: classes.dex */
public final class r0 implements Iterator {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f25109Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f25110Z;

    /* renamed from: h0  reason: collision with root package name */
    public Object f25111h0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(AbstractC4460e abstractC4460e, int i10) {
        this(abstractC4460e);
        this.f25109Y = 4;
    }

    public final String a() {
        switch (this.f25109Y) {
            case 0:
                return (String) ((Iterator) this.f25110Z).next();
            case 1:
                return (String) ((Iterator) this.f25110Z).next();
            case 2:
            default:
                return (String) ((Iterator) this.f25110Z).next();
            case 3:
                return (String) ((Iterator) this.f25110Z).next();
        }
    }

    public final lg.w b() {
        lg.w wVar;
        lg.w wVar2 = (lg.w) this.f25111h0;
        if (wVar2 != null) {
            while (true) {
                if (((Stack) this.f25110Z).isEmpty()) {
                    wVar = null;
                    break;
                }
                AbstractC4460e abstractC4460e = ((C4443A) ((Stack) this.f25110Z).pop()).f38333i0;
                while (abstractC4460e instanceof C4443A) {
                    C4443A c4443a = (C4443A) abstractC4460e;
                    ((Stack) this.f25110Z).push(c4443a);
                    abstractC4460e = c4443a.f38332h0;
                }
                wVar = (lg.w) abstractC4460e;
                if (wVar.f38418Z.length != 0) {
                    break;
                }
            }
            this.f25111h0 = wVar;
            return wVar2;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f25109Y) {
            case 0:
                return ((Iterator) this.f25110Z).hasNext();
            case 1:
                return ((Iterator) this.f25110Z).hasNext();
            case 2:
                return ((Iterator) this.f25110Z).hasNext();
            case 3:
                return ((Iterator) this.f25110Z).hasNext();
            case 4:
                if (((lg.w) this.f25111h0) == null) {
                    return false;
                }
                return true;
            case 5:
                return ((Iterator) this.f25110Z).hasNext();
            default:
                wi.s sVar = (wi.s) this.f25110Z;
                if (sVar == null || sVar == ((wi.s) this.f25111h0)) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f25109Y) {
            case 0:
                return a();
            case 1:
                return a();
            case 2:
                return (String) ((Iterator) this.f25110Z).next();
            case 3:
                return a();
            case 4:
                return b();
            case 5:
                return a();
            default:
                wi.s sVar = (wi.s) this.f25110Z;
                this.f25110Z = sVar.f48612e;
                return sVar;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f25109Y) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            case 5:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException("remove");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(wi.s sVar, wi.s sVar2, int i10) {
        this(sVar, sVar2);
        this.f25109Y = 6;
    }

    public r0(com.google.android.gms.internal.play_billing.E0 e02) {
        this.f25109Y = 2;
        this.f25111h0 = e02;
        this.f25110Z = e02.f26841Y.iterator();
    }

    public r0(wi.s sVar, wi.s sVar2) {
        this.f25109Y = 6;
        this.f25110Z = sVar;
        this.f25111h0 = sVar2;
    }

    public r0(C4449G c4449g) {
        this.f25109Y = 5;
        this.f25111h0 = c4449g;
        this.f25110Z = c4449g.f38348Y.iterator();
    }

    public r0(s0 s0Var) {
        this.f25109Y = 0;
        this.f25111h0 = s0Var;
        this.f25110Z = s0Var.f25112Y.iterator();
    }

    public r0(androidx.glance.appwidget.protobuf.h0 h0Var) {
        this.f25109Y = 1;
        this.f25111h0 = h0Var;
        this.f25110Z = h0Var.f25222Y.iterator();
    }

    public r0(x1 x1Var) {
        this.f25109Y = 3;
        this.f25111h0 = x1Var;
        this.f25110Z = x1Var.f27641Y.iterator();
    }

    public r0(AbstractC4460e abstractC4460e) {
        this.f25109Y = 4;
        this.f25110Z = new Stack();
        while (abstractC4460e instanceof C4443A) {
            C4443A c4443a = (C4443A) abstractC4460e;
            ((Stack) this.f25110Z).push(c4443a);
            abstractC4460e = c4443a.f38332h0;
        }
        this.f25111h0 = (lg.w) abstractC4460e;
    }
}
