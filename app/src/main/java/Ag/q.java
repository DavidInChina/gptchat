package Ag;

import android.gov.nist.core.Separators;
import hg.C3431j;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public class q implements u {

    /* renamed from: d  reason: collision with root package name */
    public static final String f869d = Lg.n.S2(q.class.getCanonicalName(), "");

    /* renamed from: e  reason: collision with root package name */
    public static final c f870e = new q("NO_LOCKS", b.f849a);

    /* renamed from: a  reason: collision with root package name */
    public final t f871a;

    /* renamed from: b  reason: collision with root package name */
    public final h f872b;

    /* renamed from: c  reason: collision with root package name */
    public final String f873c;

    public q(String str, t tVar) {
        C3431j c3431j = h.f853a;
        this.f871a = tVar;
        this.f872b = c3431j;
        this.f873c = str;
    }

    public static void f(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                if (!stackTrace[i10].getClassName().startsWith(f869d)) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        List subList = Arrays.asList(stackTrace).subList(i10, length);
        assertionError.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
    }

    public final l a(AbstractC6216a abstractC6216a) {
        return new l(this, abstractC6216a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Ag.n, Ag.m] */
    public final n b(wf.k kVar) {
        return new m(this, new ConcurrentHashMap(3, 1.0f, 2), kVar);
    }

    public final m c(wf.k kVar) {
        return new m(this, new ConcurrentHashMap(3, 1.0f, 2), kVar);
    }

    public final j d(AbstractC6216a abstractC6216a) {
        return new j(this, abstractC6216a);
    }

    public p e(String str, Object obj) {
        String str2;
        StringBuilder sb2 = new StringBuilder("Recursion detected ");
        sb2.append(str);
        if (obj == null) {
            str2 = "";
        } else {
            str2 = "on input: " + obj;
        }
        sb2.append(str2);
        sb2.append(" under ");
        sb2.append(this);
        AssertionError assertionError = new AssertionError(sb2.toString());
        f(assertionError);
        throw assertionError;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append(Separators.AT);
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(" (");
        return R.a.t(sb2, this.f873c, Separators.RPAREN);
    }

    public q(String str) {
        this(str, new a(new ReentrantLock()));
    }
}
