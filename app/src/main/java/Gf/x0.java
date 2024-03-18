package Gf;

import Mf.AbstractC0993b;
import Mf.AbstractC1013w;
import Pf.AbstractC1146d;
import Pf.AbstractC1158p;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.List;
import kg.C4294f;

/* loaded from: classes.dex */
public abstract class x0 {

    /* renamed from: a  reason: collision with root package name */
    public static final mg.m f6498a = mg.m.f39296c;

    public static void a(StringBuilder sb2, AbstractC0993b abstractC0993b) {
        boolean z10;
        AbstractC1146d g10 = A0.g(abstractC0993b);
        AbstractC1146d Z10 = abstractC0993b.Z();
        if (g10 != null) {
            Bg.A type = g10.getType();
            AbstractC3557B.b0("getType(...)", type);
            sb2.append(d(type));
            sb2.append(Separators.DOT);
        }
        if (g10 != null && Z10 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            sb2.append(Separators.LPAREN);
        }
        if (Z10 != null) {
            Bg.A type2 = Z10.getType();
            AbstractC3557B.b0("getType(...)", type2);
            sb2.append(d(type2));
            sb2.append(Separators.DOT);
        }
        if (z10) {
            sb2.append(Separators.RPAREN);
        }
    }

    public static String b(AbstractC1013w abstractC1013w) {
        AbstractC3557B.c0("descriptor", abstractC1013w);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("fun ");
        a(sb2, abstractC1013w);
        C4294f name = ((AbstractC1158p) abstractC1013w).getName();
        AbstractC3557B.b0("getName(...)", name);
        sb2.append(f6498a.O(name, true));
        List S = abstractC1013w.S();
        AbstractC3557B.b0("getValueParameters(...)", S);
        kf.t.l2(S, sb2, ", ", Separators.LPAREN, Separators.RPAREN, C0627b.f6393p0, 48);
        sb2.append(": ");
        Bg.A returnType = abstractC1013w.getReturnType();
        AbstractC3557B.Z(returnType);
        sb2.append(d(returnType));
        String sb3 = sb2.toString();
        AbstractC3557B.b0("toString(...)", sb3);
        return sb3;
    }

    public static String c(Mf.P p10) {
        String str;
        AbstractC3557B.c0("descriptor", p10);
        StringBuilder sb2 = new StringBuilder();
        if (p10.Y()) {
            str = "var ";
        } else {
            str = "val ";
        }
        sb2.append(str);
        a(sb2, p10);
        C4294f name = p10.getName();
        AbstractC3557B.b0("getName(...)", name);
        sb2.append(f6498a.O(name, true));
        sb2.append(": ");
        Bg.A type = p10.getType();
        AbstractC3557B.b0("getType(...)", type);
        sb2.append(d(type));
        String sb3 = sb2.toString();
        AbstractC3557B.b0("toString(...)", sb3);
        return sb3;
    }

    public static String d(Bg.A a5) {
        AbstractC3557B.c0("type", a5);
        return f6498a.Y(a5);
    }
}
