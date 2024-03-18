package lh;

import com.google.android.gms.internal.play_billing.N;
import j0.C3878C;
import java.util.List;
import java.util.ListIterator;
import lf.C4436a;
import nf.AbstractC4825e;
import of.EnumC5000a;

/* renamed from: lh.I  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4479I {

    /* renamed from: a  reason: collision with root package name */
    public final List f38449a;

    /* renamed from: b  reason: collision with root package name */
    public final Pg.k f38450b;

    public C4479I(C4436a c4436a) {
        this.f38449a = c4436a;
        Pg.k d10 = Bi.c.d(Integer.MAX_VALUE, null, 6);
        ListIterator listIterator = c4436a.listIterator(0);
        while (true) {
            C3878C c3878c = (C3878C) listIterator;
            if (c3878c.hasNext()) {
                d10.t(c3878c.next());
            } else {
                this.f38450b = d10;
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v1, types: [wf.n] */
    /* JADX WARN: Type inference failed for: r10v10, types: [wf.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C4476F c4476f, AbstractC4825e abstractC4825e) {
        C4478H c4478h;
        Object obj;
        EnumC5000a enumC5000a;
        int i10;
        C4476F c4476f2;
        C4479I c4479i;
        Object invoke;
        Object obj2;
        Pg.k kVar;
        Pg.k kVar2;
        try {
            if (abstractC4825e instanceof C4478H) {
                c4478h = (C4478H) abstractC4825e;
                int i11 = c4478h.f38448j0;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    c4478h.f38448j0 = i11 - Integer.MIN_VALUE;
                    obj = c4478h.f38446h0;
                    enumC5000a = EnumC5000a.f41328Y;
                    i10 = c4478h.f38448j0;
                    if (i10 == 0) {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 != 3) {
                                    if (i10 != 4) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    Throwable th2 = (Throwable) c4478h.f38444Y;
                                    N.B0(obj);
                                    throw th2;
                                }
                                Object obj3 = c4478h.f38444Y;
                                N.B0(obj);
                                return obj3;
                            }
                            obj2 = c4478h.f38445Z;
                            c4479i = (C4479I) c4478h.f38444Y;
                            try {
                                N.B0(obj);
                                kVar2 = c4479i.f38450b;
                                c4478h.f38444Y = obj;
                                c4478h.f38445Z = null;
                                c4478h.f38448j0 = 3;
                                if (kVar2.n(obj2, c4478h) != enumC5000a) {
                                    return enumC5000a;
                                }
                                return obj;
                            } catch (Throwable th3) {
                                obj = obj2;
                                th = th3;
                                kVar = c4479i.f38450b;
                                c4478h.f38444Y = th;
                                c4478h.f38445Z = null;
                                c4478h.f38448j0 = 4;
                                if (kVar.n(obj, c4478h) != enumC5000a) {
                                }
                            }
                        } else {
                            c4479i = (C4479I) c4478h.f38444Y;
                            N.B0(obj);
                            c4476f2 = (wf.n) c4478h.f38445Z;
                        }
                    } else {
                        N.B0(obj);
                        c4478h.f38444Y = this;
                        c4478h.f38445Z = c4476f;
                        c4478h.f38448j0 = 1;
                        obj = this.f38450b.g(c4478h);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                        c4479i = this;
                        c4476f2 = c4476f;
                    }
                    c4478h.f38444Y = c4479i;
                    c4478h.f38445Z = obj;
                    c4478h.f38448j0 = 2;
                    invoke = c4476f2.invoke(obj, c4478h);
                    if (invoke != enumC5000a) {
                        return enumC5000a;
                    }
                    Object obj4 = obj;
                    obj = invoke;
                    obj2 = obj4;
                    kVar2 = c4479i.f38450b;
                    c4478h.f38444Y = obj;
                    c4478h.f38445Z = null;
                    c4478h.f38448j0 = 3;
                    if (kVar2.n(obj2, c4478h) != enumC5000a) {
                    }
                }
            }
            c4478h.f38444Y = c4479i;
            c4478h.f38445Z = obj;
            c4478h.f38448j0 = 2;
            invoke = c4476f2.invoke(obj, c4478h);
            if (invoke != enumC5000a) {
            }
        } catch (Throwable th4) {
            th = th4;
            kVar = c4479i.f38450b;
            c4478h.f38444Y = th;
            c4478h.f38445Z = null;
            c4478h.f38448j0 = 4;
            if (kVar.n(obj, c4478h) != enumC5000a) {
                return enumC5000a;
            }
            throw th;
        }
        c4478h = new C4478H(this, abstractC4825e);
        obj = c4478h.f38446h0;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = c4478h.f38448j0;
        if (i10 == 0) {
        }
    }
}
