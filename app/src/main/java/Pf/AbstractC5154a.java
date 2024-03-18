package pf;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import nf.AbstractC4825e;
import of.EnumC5000a;

/* renamed from: pf.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5154a implements AbstractC4825e, AbstractC5157d, Serializable {
    private final AbstractC4825e completion;

    public AbstractC5154a(AbstractC4825e abstractC4825e) {
        this.completion = abstractC4825e;
    }

    public AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        AbstractC3557B.c0("completion", abstractC4825e);
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public AbstractC5157d getCallerFrame() {
        AbstractC4825e abstractC4825e = this.completion;
        if (abstractC4825e instanceof AbstractC5157d) {
            return (AbstractC5157d) abstractC4825e;
        }
        return null;
    }

    public final AbstractC4825e getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i10;
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        Integer num;
        int i11;
        AbstractC5158e abstractC5158e = (AbstractC5158e) getClass().getAnnotation(AbstractC5158e.class);
        String str2 = null;
        if (abstractC5158e == null) {
            return null;
        }
        int v10 = abstractC5158e.v();
        if (v10 <= 1) {
            int i12 = -1;
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj4 = declaredField.get(this);
                if (obj4 instanceof Integer) {
                    num = (Integer) obj4;
                } else {
                    num = null;
                }
                if (num != null) {
                    i11 = num.intValue();
                } else {
                    i11 = 0;
                }
                i10 = i11 - 1;
            } catch (Exception unused) {
                i10 = -1;
            }
            if (i10 >= 0) {
                i12 = abstractC5158e.l()[i10];
            }
            fi.i iVar = AbstractC5159f.f43138b;
            fi.i iVar2 = AbstractC5159f.f43137a;
            if (iVar == null) {
                try {
                    fi.i iVar3 = new fi.i(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                    AbstractC5159f.f43138b = iVar3;
                    iVar = iVar3;
                } catch (Exception unused2) {
                    AbstractC5159f.f43138b = iVar2;
                    iVar = iVar2;
                }
            }
            if (iVar != iVar2) {
                Method method = iVar.f30918a;
                if (method != null) {
                    obj = method.invoke(getClass(), new Object[0]);
                } else {
                    obj = null;
                }
                if (obj != null) {
                    Method method2 = iVar.f30919b;
                    if (method2 != null) {
                        obj2 = method2.invoke(obj, new Object[0]);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 != null) {
                        Method method3 = iVar.f30920c;
                        if (method3 != null) {
                            obj3 = method3.invoke(obj2, new Object[0]);
                        } else {
                            obj3 = null;
                        }
                        if (obj3 instanceof String) {
                            str2 = obj3;
                        }
                    }
                }
            }
            if (str2 == null) {
                str = abstractC5158e.c();
            } else {
                str = str2 + '/' + abstractC5158e.c();
            }
            return new StackTraceElement(str, abstractC5158e.m(), abstractC5158e.f(), i12);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v10 + ". Please update the Kotlin standard library.").toString());
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // nf.AbstractC4825e
    public final void resumeWith(Object obj) {
        AbstractC4825e abstractC4825e = this;
        while (true) {
            AbstractC5154a abstractC5154a = (AbstractC5154a) abstractC4825e;
            AbstractC4825e abstractC4825e2 = abstractC5154a.completion;
            AbstractC3557B.Z(abstractC4825e2);
            try {
                obj = abstractC5154a.invokeSuspend(obj);
                if (obj == EnumC5000a.f41328Y) {
                    return;
                }
            } catch (Throwable th2) {
                obj = N.w(th2);
            }
            abstractC5154a.releaseIntercepted();
            if (abstractC4825e2 instanceof AbstractC5154a) {
                abstractC4825e = abstractC4825e2;
            } else {
                abstractC4825e2.resumeWith(obj);
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    public AbstractC4825e create(AbstractC4825e abstractC4825e) {
        AbstractC3557B.c0("completion", abstractC4825e);
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
