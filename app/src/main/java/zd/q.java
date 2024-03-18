package zd;

import ah.AbstractC1998i;
import id.AbstractC3557B;
import jf.AbstractC3957g;
import jf.EnumC3958h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@AbstractC1998i
/* loaded from: classes.dex */
public final class q extends Enum<q> {
    public static final p Companion = new Object();

    /* renamed from: Z  reason: collision with root package name */
    public static final AbstractC3957g f51995Z = R4.b.C1(EnumC3958h.f36152Y, o.f51994Y);

    /* renamed from: h0  reason: collision with root package name */
    public static final q f51996h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final q f51997i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final q f51998j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final q f51999k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final q f52000l0;

    /* renamed from: m0  reason: collision with root package name */
    public static final /* synthetic */ q[] f52001m0;

    /* renamed from: Y  reason: collision with root package name */
    public final String f52002Y;

    /* JADX WARN: Type inference failed for: r0v1, types: [zd.p, java.lang.Object] */
    static {
        q qVar = new q("Sky", 0, "sky");
        f51996h0 = qVar;
        q qVar2 = new q("Ember", 1, "ember");
        f51997i0 = qVar2;
        q qVar3 = new q("Breeze", 2, "breeze");
        f51998j0 = qVar3;
        q qVar4 = new q("Juniper", 3, "juniper");
        f51999k0 = qVar4;
        q qVar5 = new q("Cove", 4, "cove");
        f52000l0 = qVar5;
        q[] qVarArr = {qVar, qVar2, qVar3, qVar4, qVar5};
        f52001m0 = qVarArr;
        AbstractC3557B.C0(qVarArr);
    }

    public q(String str, int i10, String str2) {
        this.f52002Y = str2;
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f52001m0.clone();
    }
}
