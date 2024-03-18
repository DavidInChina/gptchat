package android.gov.nist.javax.sip.clientauthutils;

import android.gov.nist.javax.sip.stack.SIPStackTimerTask;
import android.gov.nist.javax.sip.stack.timers.SipTimer;
import c.AbstractC2253h;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes2.dex */
class CredentialsCache {
    private ConcurrentHashMap<String, List<AbstractC2253h>> authorizationHeaders = new ConcurrentHashMap<>();
    private SipTimer timer;

    /* loaded from: classes.dex */
    public class TimeoutTask extends SIPStackTimerTask {
        String callId;
        String userName;

        public TimeoutTask(String str, String str2) {
            this.callId = str2;
            this.userName = str;
        }

        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
        public Object getThreadHash() {
            return null;
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void runTask() {
            CredentialsCache.this.authorizationHeaders.remove(this.callId);
        }
    }

    public CredentialsCache(SipTimer sipTimer) {
        this.timer = sipTimer;
    }

    public void cacheAuthorizationHeader(String str, AbstractC2253h abstractC2253h, int i10) {
        String username = abstractC2253h.getUsername();
        if (str != null) {
            List<AbstractC2253h> list = this.authorizationHeaders.get(str);
            if (list == null) {
                list = new LinkedList<>();
                this.authorizationHeaders.put(str, list);
            } else {
                String realm = abstractC2253h.getRealm();
                ListIterator<AbstractC2253h> listIterator = list.listIterator();
                while (listIterator.hasNext()) {
                    if (realm.equals(listIterator.next().getRealm())) {
                        listIterator.remove();
                    }
                }
            }
            list.add(abstractC2253h);
            TimeoutTask timeoutTask = new TimeoutTask(str, username);
            if (i10 != -1) {
                this.timer.schedule(timeoutTask, i10 * 1000);
                return;
            }
            return;
        }
        throw new NullPointerException("Call ID is null!");
    }

    public Collection<AbstractC2253h> getCachedAuthorizationHeaders(String str) {
        if (str != null) {
            return this.authorizationHeaders.get(str);
        }
        throw new NullPointerException("Null arg!");
    }

    public void removeAuthenticationHeader(String str) {
        this.authorizationHeaders.remove(str);
    }
}
