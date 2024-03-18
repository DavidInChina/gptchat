package Sf;

import id.AbstractC3557B;
import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* loaded from: classes.dex */
public final class w extends y {

    /* renamed from: a  reason: collision with root package name */
    public final Field f16627a;

    public w(Field field) {
        AbstractC3557B.c0("member", field);
        this.f16627a = field;
    }

    @Override // Sf.y
    public final Member a() {
        return this.f16627a;
    }
}
