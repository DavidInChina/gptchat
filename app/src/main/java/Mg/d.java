package Mg;

import id.AbstractC3557B;
import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class d extends Enum {

    /* renamed from: Z  reason: collision with root package name */
    public static final d f12132Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final d f12133h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final d f12134i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final d f12135j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final d f12136k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final d f12137l0;

    /* renamed from: m0  reason: collision with root package name */
    public static final /* synthetic */ d[] f12138m0;

    /* renamed from: Y  reason: collision with root package name */
    public final TimeUnit f12139Y;

    static {
        d dVar = new d("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f12132Z = dVar;
        d dVar2 = new d("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        d dVar3 = new d("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f12133h0 = dVar3;
        d dVar4 = new d("SECONDS", 3, TimeUnit.SECONDS);
        f12134i0 = dVar4;
        d dVar5 = new d("MINUTES", 4, TimeUnit.MINUTES);
        f12135j0 = dVar5;
        d dVar6 = new d("HOURS", 5, TimeUnit.HOURS);
        f12136k0 = dVar6;
        d dVar7 = new d("DAYS", 6, TimeUnit.DAYS);
        f12137l0 = dVar7;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7};
        f12138m0 = dVarArr;
        AbstractC3557B.C0(dVarArr);
    }

    public d(String str, int i10, TimeUnit timeUnit) {
        this.f12139Y = timeUnit;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f12138m0.clone();
    }
}
