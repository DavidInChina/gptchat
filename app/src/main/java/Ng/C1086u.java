package Ng;

import id.AbstractC3557B;
import java.util.concurrent.CancellationException;

/* renamed from: Ng.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1086u {

    /* renamed from: a  reason: collision with root package name */
    public final Object f12977a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC1068j f12978b;

    /* renamed from: c  reason: collision with root package name */
    public final wf.k f12979c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f12980d;

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f12981e;

    public /* synthetic */ C1086u(Object obj, AbstractC1068j abstractC1068j, wf.k kVar, CancellationException cancellationException, int i10) {
        this(obj, (i10 & 2) != 0 ? null : abstractC1068j, (i10 & 4) != 0 ? null : kVar, (Object) null, (i10 & 16) != 0 ? null : cancellationException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C1086u a(C1086u c1086u, AbstractC1068j abstractC1068j, CancellationException cancellationException, int i10) {
        Object obj = c1086u.f12977a;
        if ((i10 & 2) != 0) {
            abstractC1068j = c1086u.f12978b;
        }
        AbstractC1068j abstractC1068j2 = abstractC1068j;
        wf.k kVar = c1086u.f12979c;
        Object obj2 = c1086u.f12980d;
        CancellationException cancellationException2 = cancellationException;
        if ((i10 & 16) != 0) {
            cancellationException2 = c1086u.f12981e;
        }
        c1086u.getClass();
        return new C1086u(obj, abstractC1068j2, kVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1086u)) {
            return false;
        }
        C1086u c1086u = (C1086u) obj;
        if (AbstractC3557B.K(this.f12977a, c1086u.f12977a) && AbstractC3557B.K(this.f12978b, c1086u.f12978b) && AbstractC3557B.K(this.f12979c, c1086u.f12979c) && AbstractC3557B.K(this.f12980d, c1086u.f12980d) && AbstractC3557B.K(this.f12981e, c1086u.f12981e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        Object obj = this.f12977a;
        if (obj == null) {
            i10 = 0;
        } else {
            i10 = obj.hashCode();
        }
        int i15 = i10 * 31;
        AbstractC1068j abstractC1068j = this.f12978b;
        if (abstractC1068j == null) {
            i11 = 0;
        } else {
            i11 = abstractC1068j.hashCode();
        }
        int i16 = (i15 + i11) * 31;
        wf.k kVar = this.f12979c;
        if (kVar == null) {
            i12 = 0;
        } else {
            i12 = kVar.hashCode();
        }
        int i17 = (i16 + i12) * 31;
        Object obj2 = this.f12980d;
        if (obj2 == null) {
            i13 = 0;
        } else {
            i13 = obj2.hashCode();
        }
        int i18 = (i17 + i13) * 31;
        Throwable th2 = this.f12981e;
        if (th2 != null) {
            i14 = th2.hashCode();
        }
        return i18 + i14;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f12977a + ", cancelHandler=" + this.f12978b + ", onCancellation=" + this.f12979c + ", idempotentResume=" + this.f12980d + ", cancelCause=" + this.f12981e + ')';
    }

    public C1086u(Object obj, AbstractC1068j abstractC1068j, wf.k kVar, Object obj2, Throwable th2) {
        this.f12977a = obj;
        this.f12978b = abstractC1068j;
        this.f12979c = kVar;
        this.f12980d = obj2;
        this.f12981e = th2;
    }
}
