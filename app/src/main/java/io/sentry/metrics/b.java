package io.sentry.metrics;

import java.util.Random;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final long f34431a = new Random().nextFloat() * 10000.0f;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f34432b = 0;

    static {
        Pattern.compile("[^a-zA-Z0-9_/.-]+");
        Pattern.compile("[^\\w\\d\\s_:/@\\.\\{\\}\\[\\]$-]+");
        Pattern.compile("[^a-zA-Z0-9_/.]+");
    }
}
