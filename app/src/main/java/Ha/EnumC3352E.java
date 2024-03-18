package ha;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: ha.E  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC3352E extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final R4.a f32001Y = new Object();

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC3352E f32002Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC3352E f32003h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ EnumC3352E[] f32004i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [R4.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [ha.E, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [ha.E, java.lang.Enum] */
    static {
        ?? r22 = new Enum("Decline", 0);
        f32002Z = r22;
        ?? r32 = new Enum("Deny", 1);
        f32003h0 = r32;
        EnumC3352E[] enumC3352EArr = {r22, r32};
        f32004i0 = enumC3352EArr;
        AbstractC3557B.C0(enumC3352EArr);
    }

    public static EnumC3352E valueOf(String str) {
        return (EnumC3352E) Enum.valueOf(EnumC3352E.class, str);
    }

    public static EnumC3352E[] values() {
        return (EnumC3352E[]) f32004i0.clone();
    }
}
