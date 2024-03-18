package kotlin.jvm.internal;

import Df.AbstractC0404c;
import Df.AbstractC0407f;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* renamed from: kotlin.jvm.internal.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4305d implements AbstractC0404c, Serializable {
    public static final Object NO_RECEIVER = C4304c.f37636Y;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient AbstractC0404c reflected;
    private final String signature;

    public AbstractC4305d(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }

    @Override // Df.AbstractC0404c
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // Df.AbstractC0404c
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public AbstractC0404c compute() {
        AbstractC0404c abstractC0404c = this.reflected;
        if (abstractC0404c == null) {
            AbstractC0404c computeReflected = computeReflected();
            this.reflected = computeReflected;
            return computeReflected;
        }
        return abstractC0404c;
    }

    public abstract AbstractC0404c computeReflected();

    @Override // Df.AbstractC0403b
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // Df.AbstractC0404c
    public String getName() {
        return this.name;
    }

    public AbstractC0407f getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            return C.f37623a.c(cls, "");
        }
        return C.f37623a.b(cls);
    }

    @Override // Df.AbstractC0404c
    public List<Df.o> getParameters() {
        return getReflected().getParameters();
    }

    public abstract AbstractC0404c getReflected();

    @Override // Df.AbstractC0404c
    public Df.w getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // Df.AbstractC0404c
    public List<Df.x> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // Df.AbstractC0404c
    public Df.B getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // Df.AbstractC0404c
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // Df.AbstractC0404c
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // Df.AbstractC0404c
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
