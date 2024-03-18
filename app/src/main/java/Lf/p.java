package Lf;

import K4.J;
import Mf.AbstractC0994c;
import Mf.AbstractC0997f;
import id.AbstractC3557B;
import java.io.Serializable;
import kotlin.jvm.internal.B;

/* loaded from: classes2.dex */
public final class p extends Ig.i {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f11110c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Serializable f11111d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f11112e;

    public p(Serializable serializable, Serializable serializable2, int i10) {
        this.f11110c = i10;
        this.f11112e = serializable;
        this.f11111d = serializable2;
    }

    @Override // Ig.i
    public final void c(Object obj) {
        switch (this.f11110c) {
            case 1:
                AbstractC0994c abstractC0994c = (AbstractC0994c) obj;
                AbstractC3557B.c0("current", abstractC0994c);
                B b10 = (B) this.f11111d;
                if (b10.f37622Y == null && ((Boolean) ((wf.k) this.f11112e).invoke(abstractC0994c)).booleanValue()) {
                    b10.f37622Y = abstractC0994c;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // Ig.i
    public final boolean d(Object obj) {
        int i10 = this.f11110c;
        Object obj2 = this.f11112e;
        Serializable serializable = this.f11111d;
        switch (i10) {
            case 0:
                AbstractC0997f abstractC0997f = (AbstractC0997f) obj;
                AbstractC3557B.c0("javaClassDescriptor", abstractC0997f);
                String d02 = J.d0(abstractC0997f, (String) obj2);
                if (t.f11125b.contains(d02)) {
                    ((B) serializable).f37622Y = k.f11098Y;
                } else if (t.f11127d.contains(d02)) {
                    ((B) serializable).f37622Y = k.f11099Z;
                } else if (t.f11126c.contains(d02)) {
                    ((B) serializable).f37622Y = k.f11100h0;
                } else if (t.f11124a.contains(d02)) {
                    ((B) serializable).f37622Y = k.f11102j0;
                }
                if (((B) serializable).f37622Y != null) {
                    return false;
                }
                return true;
            case 1:
                AbstractC3557B.c0("current", (AbstractC0994c) obj);
                if (((B) serializable).f37622Y != null) {
                    return false;
                }
                return true;
            default:
                if (((Boolean) ((wf.k) obj2).invoke(obj)).booleanValue()) {
                    ((boolean[]) serializable)[0] = true;
                }
                return !((boolean[]) serializable)[0];
        }
    }

    @Override // Ig.i
    public final Object j() {
        int i10 = this.f11110c;
        Serializable serializable = this.f11111d;
        switch (i10) {
            case 0:
                k kVar = (k) ((B) serializable).f37622Y;
                if (kVar == null) {
                    return k.f11101i0;
                }
                return kVar;
            case 1:
                return (AbstractC0994c) ((B) serializable).f37622Y;
            default:
                return Boolean.valueOf(((boolean[]) serializable)[0]);
        }
    }

    public p(B b10, wf.k kVar) {
        this.f11110c = 1;
        this.f11111d = b10;
        this.f11112e = kVar;
    }
}
