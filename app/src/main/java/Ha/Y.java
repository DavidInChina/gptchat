package ha;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class Y extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final R4.a f32051Y = new Object();

    /* renamed from: Z  reason: collision with root package name */
    public static final Y f32052Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ Y[] f32053h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [R4.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, ha.Y] */
    static {
        ?? r12 = new Enum("Failure", 0);
        f32052Z = r12;
        Y[] yArr = {r12};
        f32053h0 = yArr;
        AbstractC3557B.C0(yArr);
    }

    public static Y valueOf(String str) {
        return (Y) Enum.valueOf(Y.class, str);
    }

    public static Y[] values() {
        return (Y[]) f32053h0.clone();
    }
}
