package yg;

import Lg.n;
import gg.AbstractC3271b;
import id.AbstractC3557B;
import kg.C4291c;
import lg.C4464i;
import lg.C4470o;
import wg.AbstractC6224a;

/* renamed from: yg.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6584a extends AbstractC6224a {

    /* renamed from: q  reason: collision with root package name */
    public static final C6584a f50909q;

    /* JADX WARN: Type inference failed for: r14v0, types: [wg.a, yg.a] */
    static {
        C4464i c4464i = new C4464i();
        AbstractC3271b.a(c4464i);
        C4470o c4470o = AbstractC3271b.f31620a;
        AbstractC3557B.b0("packageFqName", c4470o);
        C4470o c4470o2 = AbstractC3271b.f31622c;
        AbstractC3557B.b0("constructorAnnotation", c4470o2);
        C4470o c4470o3 = AbstractC3271b.f31621b;
        AbstractC3557B.b0("classAnnotation", c4470o3);
        C4470o c4470o4 = AbstractC3271b.f31623d;
        AbstractC3557B.b0("functionAnnotation", c4470o4);
        C4470o c4470o5 = AbstractC3271b.f31624e;
        AbstractC3557B.b0("propertyAnnotation", c4470o5);
        C4470o c4470o6 = AbstractC3271b.f31625f;
        AbstractC3557B.b0("propertyGetterAnnotation", c4470o6);
        C4470o c4470o7 = AbstractC3271b.f31626g;
        AbstractC3557B.b0("propertySetterAnnotation", c4470o7);
        C4470o c4470o8 = AbstractC3271b.f31628i;
        AbstractC3557B.b0("enumEntryAnnotation", c4470o8);
        C4470o c4470o9 = AbstractC3271b.f31627h;
        AbstractC3557B.b0("compileTimeValue", c4470o9);
        C4470o c4470o10 = AbstractC3271b.f31629j;
        AbstractC3557B.b0("parameterAnnotation", c4470o10);
        C4470o c4470o11 = AbstractC3271b.f31630k;
        AbstractC3557B.b0("typeAnnotation", c4470o11);
        C4470o c4470o12 = AbstractC3271b.f31631l;
        AbstractC3557B.b0("typeParameterAnnotation", c4470o12);
        f50909q = new AbstractC6224a(c4464i, c4470o, c4470o2, c4470o3, c4470o4, c4470o5, c4470o6, c4470o7, c4470o8, c4470o9, c4470o10, c4470o11, c4470o12);
    }

    public static String a(C4291c c4291c) {
        String str;
        AbstractC3557B.c0("fqName", c4291c);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(n.z2(c4291c.b(), '.', '/'));
        sb2.append('/');
        if (c4291c.d()) {
            str = "default-package";
        } else {
            str = c4291c.f().b();
            AbstractC3557B.b0("asString(...)", str);
        }
        sb2.append(str.concat(".kotlin_builtins"));
        return sb2.toString();
    }
}
