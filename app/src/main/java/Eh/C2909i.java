package eh;

import id.AbstractC3557B;

/* renamed from: eh.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2909i {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f29441a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f29442b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f29443c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f29444d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f29445e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f29446f;

    /* renamed from: g  reason: collision with root package name */
    public final String f29447g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f29448h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f29449i;

    /* renamed from: j  reason: collision with root package name */
    public final String f29450j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f29451k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f29452l;

    /* renamed from: m  reason: collision with root package name */
    public final AbstractC2923w f29453m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f29454n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f29455o;

    /* renamed from: p  reason: collision with root package name */
    public final EnumC2901a f29456p;

    public C2909i(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str, boolean z16, boolean z17, String str2, boolean z18, boolean z19, AbstractC2923w abstractC2923w, boolean z20, boolean z21, EnumC2901a enumC2901a) {
        AbstractC3557B.c0("prettyPrintIndent", str);
        AbstractC3557B.c0("classDiscriminator", str2);
        AbstractC3557B.c0("classDiscriminatorMode", enumC2901a);
        this.f29441a = z10;
        this.f29442b = z11;
        this.f29443c = z12;
        this.f29444d = z13;
        this.f29445e = z14;
        this.f29446f = z15;
        this.f29447g = str;
        this.f29448h = z16;
        this.f29449i = z17;
        this.f29450j = str2;
        this.f29451k = z18;
        this.f29452l = z19;
        this.f29453m = abstractC2923w;
        this.f29454n = z20;
        this.f29455o = z21;
        this.f29456p = enumC2901a;
    }

    public final String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f29441a + ", ignoreUnknownKeys=" + this.f29442b + ", isLenient=" + this.f29443c + ", allowStructuredMapKeys=" + this.f29444d + ", prettyPrint=" + this.f29445e + ", explicitNulls=" + this.f29446f + ", prettyPrintIndent='" + this.f29447g + "', coerceInputValues=" + this.f29448h + ", useArrayPolymorphism=" + this.f29449i + ", classDiscriminator='" + this.f29450j + "', allowSpecialFloatingPointValues=" + this.f29451k + ", useAlternativeNames=" + this.f29452l + ", namingStrategy=" + this.f29453m + ", decodeEnumsCaseInsensitive=" + this.f29454n + ", allowTrailingComma=" + this.f29455o + ", classDiscriminatorMode=" + this.f29456p + ')';
    }
}
