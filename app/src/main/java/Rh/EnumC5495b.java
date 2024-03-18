package rh;

import Eh.AbstractC0511j;
import Rh.p1;
import vh.l;
import wh.AbstractC6256u;
import yh.l1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: rh.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC5495b extends Enum implements AbstractC5496c {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC5495b f44987Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ EnumC5495b[] f44988Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, rh.b] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f44987Y = r12;
        f44988Z = new EnumC5495b[]{r12};
    }

    public static EnumC5495b valueOf(String str) {
        return (EnumC5495b) Enum.valueOf(EnumC5495b.class, str);
    }

    public static EnumC5495b[] values() {
        return (EnumC5495b[]) f44988Z.clone();
    }

    @Override // rh.AbstractC5496c
    public final int a(int i10) {
        return i10;
    }

    @Override // rh.AbstractC5496c
    public final int c(int i10) {
        return i10;
    }

    @Override // rh.AbstractC5496c
    public final io.sentry.vendor.b b(l1 l1Var, io.sentry.vendor.b bVar, AbstractC0511j abstractC0511j, p1 p1Var, l lVar, AbstractC6256u abstractC6256u, int i10, int i11) {
        return bVar;
    }
}
