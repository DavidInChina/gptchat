package Uf;

import cg.C2416g;
import cg.EnumC2415f;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jf.C3959i;
import kf.AbstractC4268D;
import kg.C4291c;
import l8.AbstractC4344b;

/* renamed from: Uf.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1441c {

    /* renamed from: e  reason: collision with root package name */
    public static final Map f17814e;

    /* renamed from: f  reason: collision with root package name */
    public static final LinkedHashMap f17815f;

    /* renamed from: a  reason: collision with root package name */
    public static final C4291c f17810a = new C4291c("javax.annotation.meta.TypeQualifierNickname");

    /* renamed from: b  reason: collision with root package name */
    public static final C4291c f17811b = new C4291c("javax.annotation.meta.TypeQualifier");

    /* renamed from: c  reason: collision with root package name */
    public static final C4291c f17812c = new C4291c("javax.annotation.meta.TypeQualifierDefault");

    /* renamed from: d  reason: collision with root package name */
    public static final C4291c f17813d = new C4291c("kotlin.annotations.jvm.UnderMigration");

    /* renamed from: g  reason: collision with root package name */
    public static final Set f17816g = R4.b.X1(E.f17750h, E.f17751i);

    static {
        EnumC1440b enumC1440b = EnumC1440b.f17804h0;
        List G02 = AbstractC4344b.G0(EnumC1440b.f17805i0, EnumC1440b.f17803Z, enumC1440b, EnumC1440b.f17807k0, EnumC1440b.f17806j0);
        C4291c c4291c = E.f17745c;
        EnumC2415f enumC2415f = EnumC2415f.f26630h0;
        Map a12 = AbstractC4268D.a1(new C3959i(c4291c, new s(new C2416g(enumC2415f, false), G02, false)), new C3959i(E.f17748f, new s(new C2416g(enumC2415f, false), G02, false)));
        f17814e = a12;
        f17815f = AbstractC4268D.e1(AbstractC4268D.a1(new C3959i(new C4291c("javax.annotation.ParametersAreNullableByDefault"), new s(new C2416g(EnumC2415f.f26629Z, false), AbstractC4344b.F0(enumC1440b))), new C3959i(new C4291c("javax.annotation.ParametersAreNonnullByDefault"), new s(new C2416g(enumC2415f, false), AbstractC4344b.F0(enumC1440b)))), a12);
    }
}
