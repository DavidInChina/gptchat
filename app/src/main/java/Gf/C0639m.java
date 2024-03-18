package Gf;

import Sf.AbstractC1385d;
import id.AbstractC3557B;
import java.lang.reflect.Field;

/* renamed from: Gf.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0639m extends U3.f {

    /* renamed from: g  reason: collision with root package name */
    public final Field f6429g;

    public C0639m(Field field) {
        AbstractC3557B.c0("field", field);
        this.f6429g = field;
    }

    @Override // U3.f
    public final String i() {
        StringBuilder sb2 = new StringBuilder();
        Field field = this.f6429g;
        String name = field.getName();
        AbstractC3557B.b0("getName(...)", name);
        sb2.append(Uf.C.a(name));
        sb2.append("()");
        Class<?> type = field.getType();
        AbstractC3557B.b0("getType(...)", type);
        sb2.append(AbstractC1385d.b(type));
        return sb2.toString();
    }
}
