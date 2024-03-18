package Wa;

import ah.AbstractC1998i;
import id.AbstractC3557B;
import jf.AbstractC3957g;
import jf.EnumC3958h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@AbstractC1998i
/* loaded from: classes.dex */
public final class z extends Enum<z> {
    public static final y Companion = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public static final AbstractC3957g f20878Y = R4.b.C1(EnumC3958h.f36152Y, x.f20877Y);

    /* renamed from: Z  reason: collision with root package name */
    public static final z f20879Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final z f20880h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ z[] f20881i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, Wa.y] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, Wa.z] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, Wa.z] */
    static {
        ?? r22 = new Enum("Keep", 0);
        f20879Z = r22;
        ?? r32 = new Enum("Hide", 1);
        f20880h0 = r32;
        z[] zVarArr = {r22, r32};
        f20881i0 = zVarArr;
        AbstractC3557B.C0(zVarArr);
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f20881i0.clone();
    }
}
