package o1;

import eg.EnumC2893a;
import id.AbstractC3557B;
import java.io.Serializable;

/* renamed from: o1.I  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4885I {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f40435a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final int f40436b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f40437c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f40438d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f40439e;

    /* renamed from: f  reason: collision with root package name */
    public final String[] f40440f;

    /* renamed from: g  reason: collision with root package name */
    public final String[] f40441g;

    /* renamed from: h  reason: collision with root package name */
    public final String f40442h;

    /* renamed from: i  reason: collision with root package name */
    public final Serializable f40443i;

    /* renamed from: j  reason: collision with root package name */
    public final Cloneable f40444j;

    public C4885I(EnumC2893a enumC2893a, jg.g gVar, String[] strArr, String[] strArr2, String[] strArr3, String str, int i10, String str2, byte[] bArr) {
        AbstractC3557B.c0("kind", enumC2893a);
        this.f40437c = enumC2893a;
        this.f40438d = gVar;
        this.f40439e = strArr;
        this.f40440f = strArr2;
        this.f40441g = strArr3;
        this.f40442h = str;
        this.f40436b = i10;
    }

    public final String toString() {
        switch (this.f40435a) {
            case 1:
                return ((EnumC2893a) this.f40437c) + " version=" + ((jg.g) this.f40438d);
            default:
                return super.toString();
        }
    }
}
