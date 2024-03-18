package Gf;

import Mf.AbstractC0997f;
import Mf.EnumC0998g;
import id.AbstractC3557B;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kg.C4290b;
import kg.C4294f;
import lc.C4385I;
import ng.AbstractC4838e;
import rg.AbstractC5493d;
import wf.AbstractC6216a;
import yf.AbstractC6583a;

/* renamed from: Gf.v  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0647v extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f6479Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ B f6480Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C0649x f6481h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0647v(C0649x c0649x, B b10, int i10) {
        super(0);
        this.f6479Y = i10;
        this.f6481h0 = c0649x;
        this.f6480Z = b10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        Field field;
        String b10;
        int i10 = this.f6479Y;
        C0649x c0649x = this.f6481h0;
        B b11 = this.f6480Z;
        switch (i10) {
            case 0:
                AbstractC0997f a5 = c0649x.a();
                if (a5.e() != EnumC0998g.f12089k0) {
                    return null;
                }
                if (a5.q()) {
                    LinkedHashSet linkedHashSet = Jf.e.f9104a;
                    if (!AbstractC3557B.P1(a5)) {
                        field = b11.f6332Z.getEnclosingClass().getDeclaredField(a5.getName().b());
                        Object obj = field.get(null);
                        AbstractC3557B.a0("null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl", obj);
                        return obj;
                    }
                }
                field = b11.f6332Z.getDeclaredField("INSTANCE");
                Object obj2 = field.get(null);
                AbstractC3557B.a0("null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl", obj2);
                return obj2;
            case 1:
                if (b11.f6332Z.isAnonymousClass()) {
                    return null;
                }
                C4290b z10 = b11.z();
                if (z10.f37495c) {
                    c0649x.getClass();
                    Class cls = b11.f6332Z;
                    String simpleName = cls.getSimpleName();
                    Method enclosingMethod = cls.getEnclosingMethod();
                    if (enclosingMethod != null) {
                        b10 = Lg.n.O2(simpleName, enclosingMethod.getName() + '$', simpleName);
                    } else {
                        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                        if (enclosingConstructor != null) {
                            b10 = Lg.n.O2(simpleName, enclosingConstructor.getName() + '$', simpleName);
                        } else {
                            b10 = Lg.n.N2('$', simpleName, simpleName);
                        }
                    }
                } else {
                    b10 = z10.i().b();
                    AbstractC3557B.b0("asString(...)", b10);
                }
                return b10;
            case 2:
                return mo122invoke();
            default:
                return mo122invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0647v(B b10, C0649x c0649x) {
        super(0);
        this.f6479Y = 1;
        this.f6480Z = b10;
        this.f6481h0 = c0649x;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke  reason: collision with other method in class */
    public final List mo122invoke() {
        int i10 = this.f6479Y;
        B b10 = this.f6480Z;
        C0649x c0649x = this.f6481h0;
        switch (i10) {
            case 2:
                Collection<Bg.A> l10 = c0649x.a().f().l();
                AbstractC3557B.b0("getSupertypes(...)", l10);
                ArrayList arrayList = new ArrayList(l10.size());
                for (Bg.A a5 : l10) {
                    AbstractC3557B.Z(a5);
                    arrayList.add(new r0(a5, new C4385I(a5, c0649x, b10, 9)));
                }
                AbstractC0997f a10 = c0649x.a();
                C4294f c4294f = Jf.l.f9117e;
                if (!Jf.l.b(a10, Jf.p.f9165a) && !Jf.l.b(a10, Jf.p.f9167b)) {
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            EnumC0998g e10 = AbstractC4838e.c(((r0) it.next()).f6460Y).e();
                            AbstractC3557B.b0("getKind(...)", e10);
                            if (e10 == EnumC0998g.f12085Z || e10 == EnumC0998g.f12088j0) {
                            }
                        }
                    }
                    Bg.D e11 = AbstractC5493d.e(c0649x.a()).e();
                    AbstractC3557B.b0("getAnyType(...)", e11);
                    arrayList.add(new r0(e11, C0648w.f6485Y));
                }
                return Ig.i.e(arrayList);
            default:
                List<Mf.b0> o10 = c0649x.a().o();
                AbstractC3557B.b0("getDeclaredTypeParameters(...)", o10);
                ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(o10, 10));
                for (Mf.b0 b0Var : o10) {
                    AbstractC3557B.Z(b0Var);
                    arrayList2.add(new s0(b10, b0Var));
                }
                return arrayList2;
        }
    }
}
