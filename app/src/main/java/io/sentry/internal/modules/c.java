package io.sentry.internal.modules;

import io.sentry.EnumC3642e1;
import io.sentry.H;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class c extends d {

    /* renamed from: d  reason: collision with root package name */
    public final Pattern f34394d = Pattern.compile(".*/(.+)!/META-INF/MANIFEST.MF");

    /* renamed from: e  reason: collision with root package name */
    public final Pattern f34395e = Pattern.compile("(.*?)-(\\d+\\.\\d+.*).jar");

    /* renamed from: f  reason: collision with root package name */
    public final ClassLoader f34396f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(H h10) {
        super(h10);
        ClassLoader classLoader = c.class.getClassLoader();
        this.f34396f = classLoader == null ? ClassLoader.getSystemClassLoader() : classLoader;
    }

    @Override // io.sentry.internal.modules.d
    public final Map b() {
        String str;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = this.f34396f.getResources("META-INF/MANIFEST.MF");
            while (resources.hasMoreElements()) {
                Matcher matcher = this.f34394d.matcher(resources.nextElement().toString());
                b bVar = null;
                if (matcher.matches() && matcher.groupCount() == 1) {
                    str = matcher.group(1);
                } else {
                    str = null;
                }
                if (str != null) {
                    Matcher matcher2 = this.f34395e.matcher(str);
                    if (matcher2.matches() && matcher2.groupCount() == 2) {
                        bVar = new b(matcher2.group(1), matcher2.group(2));
                    }
                }
                if (bVar != null) {
                    arrayList.add(bVar);
                }
            }
        } catch (Throwable th2) {
            this.f34398a.d(EnumC3642e1.ERROR, "Unable to detect modules via manifest files.", th2);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar2 = (b) it.next();
            hashMap.put(bVar2.f34392a, bVar2.f34393b);
        }
        return hashMap;
    }
}
