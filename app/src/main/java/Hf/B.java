package Hf;

import id.AbstractC3557B;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;

/* loaded from: classes.dex */
public final class B implements g {

    /* renamed from: a  reason: collision with root package name */
    public static final B f7683a = new Object();

    @Override // Hf.g
    public final List a() {
        return kf.v.f37483Y;
    }

    @Override // Hf.g
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // Hf.g
    public final Object call(Object[] objArr) {
        AbstractC3557B.c0("args", objArr);
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // Hf.g
    public final Type getReturnType() {
        Class cls = Void.TYPE;
        AbstractC3557B.b0("TYPE", cls);
        return cls;
    }
}
