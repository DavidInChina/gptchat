package Sf;

import bg.AbstractC2208p;
import id.AbstractC3557B;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class t extends y implements AbstractC2208p {

    /* renamed from: a  reason: collision with root package name */
    public final Constructor f16625a;

    public t(Constructor constructor) {
        AbstractC3557B.c0("member", constructor);
        this.f16625a = constructor;
    }

    @Override // Sf.y
    public final Member a() {
        return this.f16625a;
    }

    @Override // bg.AbstractC2208p
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.f16625a.getTypeParameters();
        AbstractC3557B.b0("getTypeParameters(...)", typeParameters);
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new E(typeVariable));
        }
        return arrayList;
    }
}
