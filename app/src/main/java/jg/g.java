package jg;

import hg.AbstractC3423b;
import id.AbstractC3557B;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g extends AbstractC3423b {

    /* renamed from: g  reason: collision with root package name */
    public static final g f36187g;

    /* renamed from: h  reason: collision with root package name */
    public static final g f36188h;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f36189f;

    static {
        g gVar;
        g gVar2 = new g(1, 9, 0);
        f36187g = gVar2;
        int i10 = gVar2.f32292c;
        int i11 = gVar2.f32291b;
        if (i11 == 1 && i10 == 9) {
            gVar = new g(2, 0, 0);
        } else {
            gVar = new g(i11, i10 + 1, 0);
        }
        f36188h = gVar;
        new g(new int[0]);
    }

    public g(int... iArr) {
        this(iArr, false);
    }

    public final boolean b(g gVar) {
        AbstractC3557B.c0("metadataVersionFromLanguageVersion", gVar);
        g gVar2 = f36187g;
        int i10 = this.f32291b;
        int i11 = this.f32292c;
        if (i10 == 2 && i11 == 0 && gVar2.f32291b == 1 && gVar2.f32292c == 8) {
            return true;
        }
        if (!this.f36189f) {
            gVar2 = f36188h;
        }
        gVar2.getClass();
        int i12 = gVar.f32291b;
        int i13 = gVar2.f32291b;
        if (i13 > i12 || (i13 >= i12 && gVar2.f32292c > gVar.f32292c)) {
            gVar = gVar2;
        }
        boolean z10 = false;
        if ((i10 == 1 && i11 == 0) || i10 == 0) {
            return false;
        }
        int i14 = gVar.f32291b;
        if (i10 > i14 || (i10 >= i14 && i11 > gVar.f32292c)) {
            z10 = true;
        }
        return !z10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int[] iArr, boolean z10) {
        super(Arrays.copyOf(iArr, iArr.length));
        AbstractC3557B.c0("versionArray", iArr);
        this.f36189f = z10;
    }
}
