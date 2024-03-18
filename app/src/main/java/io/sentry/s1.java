package io.sentry;

import io.sentry.android.core.AbstractC3627s;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class s1 implements io.sentry.transport.i {

    /* renamed from: Y  reason: collision with root package name */
    public final r1 f34721Y;

    public /* synthetic */ s1(r1 r1Var) {
        this.f34721Y = r1Var;
    }

    @Override // io.sentry.transport.i
    public boolean a() {
        int i10 = AbstractC3627s.f34250a[this.f34721Y.getConnectionStatusProvider().g().ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, io.sentry.protocol.w] */
    public ArrayList b(StackTraceElement[] stackTraceElementArr, boolean z10) {
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                if (stackTraceElement != null) {
                    String className = stackTraceElement.getClassName();
                    if (z10 || !className.startsWith("io.sentry.") || className.startsWith("io.sentry.samples.") || className.startsWith("io.sentry.mobile.")) {
                        ?? obj = new Object();
                        obj.f34648m0 = c(className);
                        obj.f34643h0 = className;
                        obj.f34642Z = stackTraceElement.getMethodName();
                        obj.f34641Y = stackTraceElement.getFileName();
                        if (stackTraceElement.getLineNumber() >= 0) {
                            obj.f34644i0 = Integer.valueOf(stackTraceElement.getLineNumber());
                        }
                        obj.f34650o0 = Boolean.valueOf(stackTraceElement.isNativeMethod());
                        arrayList.add(obj);
                        if (arrayList.size() >= 100) {
                            break;
                        }
                    }
                }
            }
            Collections.reverse(arrayList);
            return arrayList;
        }
        return null;
    }

    public Boolean c(String str) {
        if (str != null && !str.isEmpty()) {
            r1 r1Var = this.f34721Y;
            for (String str2 : r1Var.getInAppIncludes()) {
                if (str.startsWith(str2)) {
                    return Boolean.TRUE;
                }
            }
            for (String str3 : r1Var.getInAppExcludes()) {
                if (str.startsWith(str3)) {
                    return Boolean.FALSE;
                }
            }
            return null;
        }
        return Boolean.TRUE;
    }
}
