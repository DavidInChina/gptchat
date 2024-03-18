package qh;

import java.io.File;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: qh.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC5330d extends Enum implements AbstractC5331e {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC5330d f44140Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ EnumC5330d[] f44141Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, qh.d] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f44140Y = r12;
        f44141Z = new EnumC5330d[]{r12};
    }

    public static EnumC5330d valueOf(String str) {
        return (EnumC5330d) Enum.valueOf(EnumC5330d.class, str);
    }

    public static EnumC5330d[] values() {
        return (EnumC5330d[]) f44141Z.clone();
    }

    @Override // qh.AbstractC5331e
    public final void accept(File file) {
    }
}
