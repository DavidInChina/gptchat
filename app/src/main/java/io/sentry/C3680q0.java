package io.sentry;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.Reader;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* renamed from: io.sentry.q0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3680q0 implements E, P, Q, K1, L1 {

    /* renamed from: a  reason: collision with root package name */
    public static final C3680q0 f34684a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final C3680q0 f34685b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final C3680q0 f34686c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final C3680q0 f34687d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static final C3680q0 f34688e = new Object();

    @Override // io.sentry.Q
    public Object e(Reader reader, Class cls) {
        return null;
    }

    @Override // io.sentry.P
    public boolean f() {
        return false;
    }

    @Override // io.sentry.K1
    public List g(T t10) {
        return null;
    }

    @Override // io.sentry.Q
    public T0 h(BufferedInputStream bufferedInputStream) {
        return null;
    }

    @Override // io.sentry.Q
    public String j(Map map) {
        return "";
    }

    @Override // io.sentry.Q
    public Object k(BufferedReader bufferedReader, Class cls, C3637d c3637d) {
        return null;
    }

    @Override // io.sentry.P
    public Future l(Runnable runnable, long j6) {
        return new FutureTask(new CallableC3688v(1));
    }

    @Override // io.sentry.E
    public T0 m(BufferedInputStream bufferedInputStream) {
        return null;
    }

    @Override // io.sentry.P
    public Future submit(Runnable runnable) {
        return new FutureTask(new CallableC3688v(2));
    }

    @Override // io.sentry.K1
    public void close() {
    }

    @Override // io.sentry.K1
    public void a(S s10) {
    }

    @Override // io.sentry.P
    public void c(long j6) {
    }

    @Override // io.sentry.K1
    public void d(z1 z1Var) {
    }

    @Override // io.sentry.K1
    public void i(T t10) {
    }

    @Override // io.sentry.Q
    public void b(T0 t02, OutputStream outputStream) {
    }

    @Override // io.sentry.Q
    public void n(Object obj, BufferedWriter bufferedWriter) {
    }
}
